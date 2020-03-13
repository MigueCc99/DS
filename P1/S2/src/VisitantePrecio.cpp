#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio () : VisitanteEquipo (), precio(0) {}

void VisitantePrecio::visitarBus (Bus b) {
    precio += b.getPrecio();
}

void VisitantePrecio::visitarDisco (Disco d) {
    precio += d.getPrecio();
}

void VisitantePrecio::visitarTarjeta (Tarjeta t) {
    precio += t.getPrecio();
}

void VisitantePrecio::reiniciarVisitante () {
    precio = 0;
}

int VisitantePrecio::getPrecio () {
    return precio;
}
