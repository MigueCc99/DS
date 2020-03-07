#include <iostream>
#include "Equipo.h"
#include "VisitanteEquipo.h"
using namespace std;


int main (int argc, char argv[]) {

  Disco disco1 ("SEAGATE BARRACUDA", 100);
  Disco disco2 ("KINGSTON A400", 50);
  Disco disco3 ("TOSHIBA OCZ", 40);

  Bus bus1 ("PCIEXPRESS1", 15);
  Bus bus2 ("PCIEXPRESS1", 20);
  Bus bus3 ("PCIEXPRESS1", 30);

  Tarjeta tarjeta1 ("NVIDIA", 400);
  Tarjeta tarjeta2 ("AMD", 300);
  Tarjeta tarjeta3 ("INTEL" 150);

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

  equipo1.visitarComponentes (vp);
  equipo1.visitarComponentes (vpd);

  cout << "Equipo 1\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle();

  vp.reiniciarVisitante();
  vpe.reiniciarVisitante();

  equipo2.visitarComponentes (vp);
  equipo2.visitarComponentes (vpd);

  cout << "Equipo 2\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle();

  vp.reiniciarVisitante();
  vpe.reiniciarVisitante();

  equipo3.visitarComponentes (vp);
  equipo3.visitarComponentes (vpd);

  cout << "Equipo 3\n" << "Precio Total: " << vp.getPrecio() << endl << "Precio Detalle: " << vpd.getPrecioDetalle();

  return 0;
}
