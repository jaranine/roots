* Usuario 
    * Long id
    * String nombre
    * String email
    * TipoUsuario tipo (JOVEN, MAYOR)
    * asociaciones:
        * Perfil OnetoOne
        * Evento OnetoMany

* Perfil
    * Long id
    * String descripcion
    * Intereses intereses (enum: pasear, cartas)
    * Disponibiliadad disponibilidad (enum: MAÑANA, TARDE, INDIFERENTE)
    * asociaciones:
        * Usuario OnetoOne

* Evento
    * Long id
    * String titulo
    * String descripcion
    * Estado estado (enum: ABIERTA, CERRADA)
    * asociaciones:
        * Usuario creador ManytoOne
        * Usuario voluntario
