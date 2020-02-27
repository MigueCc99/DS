#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio (){
	precio = 0;
}
public virtual void VisitantePrecio::visitarDisco (Disco d){
	precio += d.getPrecio();
}
public virtual void VisitantePrecio::visitarTarjeta (Tarjeta t){
	precio += t.getPrecio();
}
public virtual void VisitantePrecio::visitarBus (Bus b){
	precio += b.getPrecio();
}
int VisitantePrecio::getPrecio(){
	return precio;
}