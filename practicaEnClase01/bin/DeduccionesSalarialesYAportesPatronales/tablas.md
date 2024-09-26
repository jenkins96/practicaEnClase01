## Tabla De Variables

| Descripcion | Nombre | Tipo De Dato | Ejemplo |
|--|--|--|--|
| nombre de la persona | nombre | String | Adam |
| apellido de la persona | apellido | String | Lee |
| cedula de la persona | cedula | String-int | 116340566 |
| salario bruto mensual de la persona | salarioBrutoMensual | double | 750000 |
| Monto de las deduccions del trabajador por concepto SEM | montoDeduccionTrabajadorSEM | double | 41250 |
|Monto de las deduccions del trabajador por concepto IVM  | montoDeduccionTrabajadorIVM | double | 31275 |
| Total de deducciones (suma de deducciones SEM y IVM) | totalDeduccionesCCSS | double | 72525 |
| Monto de la deduccion solidarista | montoDeduccionSolidarista | double | 37500 |
| suma de todas las deducciones | totalDeduccionesTrabajador| double | 110025 |
| Salario neto del trabajador. | salarioNeto | double | 639975 |
| Monto del aporte del patrono por concepto SEM | montoAportePatronoSEM | double | 69375 |
| Monto del aporte del trabajador por concepto IVM | montoAportePatronoIVM | double | 40650 |
| Total del aporte que realiza el patrono a la CCSS | totalAporteCCSS | double | 110025 |
| Monto del patrono a la Asociacion Solidarista | montoAportePatronoSolidarista | double | 39975 |
| Total de aportes del patrono | totalAportesPatrono | double | 150000 |

Donde:

* **nombre**
* **apellido**
* **cedula**
* **salarioBrutoMensual**
* **montoDeduccionTrabajadorSEM**: salarioBrutoMensual x SEM_DEDUCCION_TRABAJADOR_PORCENTAJE
* **montoDeduccionTrabajadorIVM**: salarioBrutoMensual x IVM_DEDUCCION_TRABAJADOR_PORCENTAJE
* **totalDeduccionesCCSS**: montoDeduccionTrabajadorSEM + montoDeduccionTrabajadorIVM
* **montoDeduccionSolidarista**: salarioMensual x APORTE_OBRERO_PORCENTAJE
* **totalDeduccionesTrabajador**:  totalDeduccionesCCSS + montoDeduccionSolidarista
* **salarioNeto**: salarioBrutoMensual - totalDeduccionesTrabajador
* **montoAportePatronoSEM**: salarioBrutoMensual x SEM_APORTE_PATRON_PORCENTAJE
* **montoAportePatronoIVM**: salarioBrutoMensual x IVM_APORTE_PATRON_PORCENTAJE
* **totalAporteCCSS**: montoAportePatronoSEM + montoAportePatronoIVM
* **montoAportePatronoSolidarista**: salarioBrutoMensual x APORTE_SOLIDARISTA_PATRONAL_PORCENTAJE
* **totalAportesPatrono**: totalAporteCCSS + montoAportePatronoSolidarista

## Tabla  De Constantes
| Descripcion | Nombre | TipoDato | Ejemplo |
|--|--|--|--|
|Aporte obrero | APORTE_OBRERO_PORCENTAJE | double | 0.05 |
|Aporte patronal | APORTE_SOLIDARISTA_PATRONAL_PORCENTAJE | double | 0.0533 |
|Aporte patronal SEM| SEM_APORTE_PATRON_PORCENTAJE | double | 0.0925 |
|Aporte trabajador SEM | SEM_DEDUCCION_TRABAJADOR_PORCENTAJE | double | 0.0550 |
|Aporte patronal IVM| IVM_APORTE_PATRON_PORCENTAJE | double | 0.0542 |
|Aporte trabajador IVM | IVM_DEDUCCION_TRABAJADOR_PORCENTAJE | double | 0.0417 |

## Tabla De Entradas

| Descripcion | Nombre | Tipo De Dato | Ejemplo |
|--|--|--|--|
| nombre de la persona | nombre | String | Adam |
| apellido de la persona | apellido | String | Lee |
| cedula de la persona | cedula | String-int | 116340566 |
| salario bruto mensual de la persona | salarioBrutoMensual | double | 750000 |

## Tabla De Salidas

| Descripcion | Ejemplo |
|--|--|
| Imprimir boleta con los detalles del trabajador |  |
| Imprimir boleta con los detalles del patrono |  |
