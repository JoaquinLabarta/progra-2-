program project1;
Uses
     sysutils;
Type
  string10 = string[10];

  jug = record
    dni: integer;
    nombre: string;
    apellido: string;
    eq: string;
    cantgoles: integer;
    end;

  listagoles = ^nodogol;
  nodogol = record
    info: jug;
    sig: listagoles;
  end;

  partido = record
    idpartido: string;
    eq1: string;
    eq2: string;
    fecha: string10;
    estadio: string;
    goljug: listagoles;
  end;

  listapartidos = ^nodopartidos;
  nodopartidos = record
    info: partido;
    sig:listapartidos;
  end;

  listaint = ^nodoint;
  nodoint = record
    fecha: string10;
    cantgoles: integer;
    sig: listaint;
  end;

  infoarb = record
    dni: integer;
    nombre: string;
    apellido: string;
    eq: string;
  end;

  arbol = ^nodoa;
  nodoa = record
    info: infoarb;
    lint: listaint;
    hd: arbol;
    hi: arbol;
  end;

Procedure agregar2(var l: listaint; cantgoles:integer; fecha:string10);
var
   aux: listaint;
begin
     new(aux);
     aux^.cantgoles := cantgoles;
     aux^.fecha := fecha;
     aux^.sig := l;
     l:= aux;
end;

Procedure insertar(var a: arbol; data:jug; fecha:string10);
begin
   if (a = nil)then
    begin
      new (a);
      with(data)do begin
        a^.info.dni:=dni;
        a^.info.nombre:=nombre;
        a^.info.apellido:=apellido;
        a^.info.eq:=eq;
        a^.lint:=nil;

        agregar2(a^.lint,data.cantgoles,fecha);

       end;
      a^.HI := nil;
      a^.HD := nil;
    end
   else
     if a^.info.dni > data.dni then
      insertar(a^.hi,data,fecha)
    else
      if a^.info.dni < data.dni then
       insertar(a^.hd,data,fecha)
    else
      agregar2(a^.lint,data.cantgoles,fecha);

  end;

procedure recorrerl(var a:arbol; l:listapartidos);
var
   dnia:integer;
begin
  while(l<>nil)do begin
    while (l^.info.goljug<>nil)do begin
      dnia:=l^.info.goljug^.info.dni;
      if (dnia = l^.info.goljug^.info.dni) then begin
        insertar(a,l^.info.goljug^.info,l^.info.fecha);
        l^.info.goljug:=l^.info.goljug^.sig;
      end;
    end;
    l:=l^.sig;
  end;
end;

function recorrerlista (l: listaint): integer;
var
   aux: listaint;
   cant: integer;
begin
  aux:= l;
  cant:=0;
  while (aux <> nil) do begin
    cant:= cant + aux^.cantgoles;
    aux:=aux^.sig;
  end;
  recorrerlista:=cant;
end;

Procedure maximogoleador(a: arbol; var max: integer; var eq: string );
var
   cant: integer;
begin
  if ( a <> nil ) then begin
    cant:= recorrerlista(a^.lint);
    if(a^.lint^.cantgoles>=max)then begin
      max:=cant;
      eq:=a^.info.eq;
    end;
    maximogoleador(a^.hi,max,eq);
    maximogoleador(a^.hd,max,eq);
end;

end;

procedure acotado(a:arbol;inf:integer;sup:integer);
begin
  if(a<>nil)then
   if(a^.info.dni>=inf)then
    if(a^.info.dni<=sup)then begin
      writeln('Dni: ', a^.info.dni, 'Nombre y apellido: ', a^.info.nombre, a^.info.apellido);
      acotado(a^.HI,inf,sup);
      acotado(a^.HD,inf,sup);
    end
    else acotado(a^.HI,inf,sup)
   else acotado(a^.HD,inf,sup);
  end;

var
  a: arbol;
  //p: partido;
  lp: listapartidos;
  maxgoles: integer;
  maxeq: string;
  inf, sup: integer;

begin
  //Dispongo:
  {leerpartido(p);
  cargarlistapartidos(p,lp);}

  lp:=nil;
  a:=nil;
  recorrerl(a,lp);

  maxgoles:=-1;
  maxeq:= ' ';
  maximogoleador(a,maxgoles,maxeq);
  writeln('El mayor goleador del torneo esta en: ', maxeq ,' con: ', maxgoles);

  inf:=28000000;
  sup:=32000000;
  acotado(a,inf,sup);

  readln();
end.

