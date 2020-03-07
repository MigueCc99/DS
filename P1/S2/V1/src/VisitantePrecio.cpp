#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio (){
	reiniciarVisitante ();
}
public void VisitantePrecio::visitarDisco (Disco d){
	precio += d.getPrecio();
}
public void VisitantePrecio::visitarTarjeta (Tarjeta t){
	precio += t.getPrecio();
}
public void VisitantePrecio::visitarBus (Bus b){
	precio += b.getPrecio();
}
public void reiniciarVisitante (){
	precio = 0;
}
int VisitantePrecio::getPrecio (){
	return precio;
}
