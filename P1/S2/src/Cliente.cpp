#include <iostream>
#include "Equipo.h"
#include "ComponenteEquipo.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"
#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"
using namespace std;


int main (int argc, char *argv[]) {
/*
  Disco *disco1 = new Disco ("SEAGATE BARRACUDA", 100);
  Disco *disco2 = new Disco ("KINGSTON A400", 50);
  Disco *disco3 = new Disco ("TOSHIBA OCZ", 40);

  Bus *bus1 = new Bus ("PCIEXPRESS1", 15);
  Bus *bus2 = new Bus ("PCIEXPRESS2", 20);
  Bus *bus3 = new Bus ("PCIEXPRESS3", 30);

  Tarjeta *tarjeta1 = new Tarjeta ("NVIDIA", 400);
  Tarjeta *tarjeta2 = new Tarjeta ("AMD", 300);
  Tarjeta *tarjeta3 = new Tarjeta ("INTEL", 150);
*/
  Disco disco1 ("SEAGATE BARRACUDA", 100);
  Disco disco2 ("KINGSTON A400", 50);
  Disco disco3 ("TOSHIBA OCZ", 40);

  Bus bus1 ("PCIEXPRESS1", 15);
  Bus bus2 ("PCIEXPRESS2", 20);
  Bus bus3 ("PCIEXPRESS3", 30);

  Tarjeta tarjeta1 ("NVIDIA", 400);
  Tarjeta tarjeta2 ("AMD", 300);
  Tarjeta tarjeta3 ("INTEL", 150);

  vector <ComponenteEquipo> componentes;

  componentes.push_back (disco1);
  componentes.push_back (bus1);
  componentes.push_back (tarjeta1);

  Equipo equipo1 (componentes);

  componentes.erase (componentes.begin(), componentes.end());

  componentes.push_back (disco2);
  componentes.push_back (bus2);
  componentes.push_back (tarjeta2);

  Equipo equipo2 (componentes);

  componentes.erase (componentes.begin(), componentes.end());

  componentes.push_back (disco3);
  componentes.push_back (bus3);
  componentes.push_back (tarjeta3);

  Equipo equipo3 (componentes);

  VisitantePrecio vp ();
  VisitantePrecioDetalle vpd ();

  ComponenteEquipo ce ();
  
/*
  for(int i=0; i<equipo1.getNumComponentes(); i++){
    ce = equipo1.getComponente(i);
    ce.aceptar(vp);
    ce.aceptar(vpd);
  }

  cout << "Equipo 1\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle();

  vp.reiniciarVisitante();
  vpd.reiniciarVisitante();

  for(int i=0; i<equipo2.getNumComponentes(); i++){
    ce = equipo2.getComponente(i);
    ce.aceptar(vp);
    ce.aceptar(vpd);
  }

  cout << "Equipo 2\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle();

  vp.reiniciarVisitante();
  vpd.reiniciarVisitante();

  for(int i=0; i<equipo3.getNumComponentes(); i++){
    ce = equipo3.getComponente(i);
    ce.aceptar(vp);
    ce.aceptar(vpd);
  }


  cout << "Equipo 3\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle();
*/
  return 0;
}
