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

  Equipo equipo1;
  equipo1.setDisco(&disco1);
  equipo1.setTarjeta(&tarjeta1);
  equipo1.setBus(&bus1);

  Equipo equipo2;
  equipo2.setDisco(&disco2);
  equipo2.setTarjeta(&tarjeta2);
  equipo2.setBus(&bus2);

  Equipo equipo3;
  equipo3.setDisco(&disco3);
  equipo3.setTarjeta(&tarjeta3);
  equipo3.setBus(&bus3);

  /*
  Equipo equipo2 (disco2,tarjeta2,bus2);

  Equipo equipo3 (disco2,tarjeta2,bus2);
  */

  VisitantePrecio vp;
  VisitantePrecioDetalle vpd;

  // Visitar los componentes del equipo1
  equipo1.getBus().aceptar(vp);
  equipo1.getBus().aceptar(vpd);
  equipo1.getTarjeta().aceptar(vp);
  equipo1.getTarjeta().aceptar(vpd);
  equipo1.getDisco().aceptar(vp);
  equipo1.getDisco().aceptar(vpd);

  cout << "\n-- Equipo 1 --\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle() << endl;

  vp.reiniciarVisitante();
  vpd.reiniciarVisitante();


  // Visitar los componentes del equipo2
  equipo2.getBus().aceptar(vp);
  equipo2.getBus().aceptar(vpd);
  equipo2.getTarjeta().aceptar(vp);
  equipo2.getTarjeta().aceptar(vpd);
  equipo2.getDisco().aceptar(vpd);

  equipo2.getDisco().aceptar(vp);
  cout << "\n-- Equipo 2 --\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle() << endl;

  vp.reiniciarVisitante();
  vpd.reiniciarVisitante();


  // Visitar los componentes del equipo3
  equipo3.getBus().aceptar(vp);
  equipo3.getBus().aceptar(vpd);
  equipo3.getTarjeta().aceptar(vp);
  equipo3.getTarjeta().aceptar(vpd);
  equipo3.getDisco().aceptar(vp);
  equipo3.getDisco().aceptar(vpd);

  cout << "\n-- Equipo 3 --\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle() << endl;


  return 0;
}
