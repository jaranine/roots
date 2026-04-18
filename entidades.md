* Raiz
    * Long id
    * Crear evento

* Voluntario
    * Long id
    * Unirse a evento

* Perfil
    * Long id
    * String nombre
    * String email
    * String descripcion
    * Intereses intereses (enum: pasear, cartas)
    * Disponibiliadad disponibilidad (enum: MAÑANA, TARDE, INDIFERENTE)

* Solicitud
    * Long id
    * String titulo
    * String descripcion
    * Creada por (usuario mayor)
    * Voluntario (usuario joven)
    * Estado estado (enum: ABIERTA, CERRADA)