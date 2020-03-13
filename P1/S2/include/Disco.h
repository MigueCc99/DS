/**
 * Universidad de Granada - Grado en Informatica : 2020
 *
 * Asignatura: Desarrollo de Software
 * Practica 1 - S2
 *
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 *
 */
#ifndef DISCO_H
#define DISCO_H


using namespace std;

class VisitanteEquipo;

// Clase Disco
class Disco : public ComponenteEquipo {
public:
    Disco (string nombre, int precio);
    void aceptar (VisitanteEquipo & ve);
};

#endif /* DISCO_H */
