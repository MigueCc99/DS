#include "VisitantePrecioDetalle.h"

VisitantePrecioDetalle::VisitantePrecioDetalle (){
	detalle = "";
}
public void VisitantePrecioDetalle::visitarDisco (Disco d){
	detalle += "Nombre Disco: " + d.getNombre() + " Precio Disco: " + d.getPrecio() + " ";
}
public void VisitantePrecioDetalle::visitarTarjeta (Tarjeta t){
	detalle += "Nombre Tarjeta: " + t.getNombre() + " Precio Tarjeta: " + t.getPrecio() + " ";
}
public void VisitantePrecioDetalle::visitarBus (Bus b){
	detalle += "Nombre Bus: " + b.getNombre() + " Precio Bus: " + b.getPrecio() + " ";
}
string VisitantePrecioDetalle::getPrecioDetalle(){
	return detalle;
}
