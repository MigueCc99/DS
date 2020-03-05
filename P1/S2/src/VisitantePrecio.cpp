#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio (){
	precio = 0;
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
int VisitantePrecio::getPrecio(){
	return precio;
}
