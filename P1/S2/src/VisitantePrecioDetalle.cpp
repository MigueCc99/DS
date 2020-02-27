#include "VisitantePrecioDetalle.h"

VisitantePrecioDetalle::VisitantePrecioDetalle (){
	detalle = "";
}
public virtual void VisitantePrecioDetalle::visitarDisco (Disco d){
	detalle += "Nombre Disco: " + d.getNombre() + " Precio Disco: " + d.getPrecio() + " ";
}
public virtual void VisitantePrecioDetalle::visitarTarjeta (Tarjeta t){
	detalle += "Nombre Tarjeta: " + t.getNombre() + " Precio Tarjeta: " + t.getPrecio() + " ";
}
public virtual void VisitantePrecioDetalle::visitarBus (Bus b){
	detalle += "Nombre Bus: " + b.getNombre() + " Precio Bus: " + b.getPrecio() + " ";	
}
string VisitantePrecioDetalle::getPrecioDetalle(){
	return detalle;
}