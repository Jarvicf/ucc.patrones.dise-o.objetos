# 📘 Guía de Estudio: Patrones Adapter y Bridge

## 🏫 Universidad Cooperativa de Colombia
### 📚 Curso: Patrones de Diseño OO - Semana 8
### 👨‍🏫 Docente: Ing. Harold Adrián Bolaños Rodríguez, MSc

---

## 📌 Descripción
Este documento aborda los patrones de diseño estructurales **Adapter** y **Bridge**, los cuales facilitan la interoperabilidad entre sistemas y mejoran la escalabilidad del software.

- **Adapter:** Permite la integración de interfaces incompatibles sin modificar su código original.
- **Bridge:** Separa una abstracción de su implementación, permitiendo mayor flexibilidad y evolución independiente.

Se presentan sus conceptos, usos y ejemplos prácticos en sectores como **facturación, transporte y comercio electrónico**.

## 📖 Contenido

### 🔹 **Conceptos Claves**
✅ **Definición de Adapter y Bridge**
✅ **Cuándo aplicarlos y cuándo evitarlos**
✅ **Ejemplos en plataformas de pagos, sistemas de notificaciones y renderizado gráfico**
✅ **Diferencias clave entre ambos patrones**

---

### 🔹 **Casos de Uso**
1️⃣ **Adapter en una Plataforma de Pagos** → Integración de un nuevo proveedor de pagos sin modificar el código existente.
2️⃣ **Bridge en Notificaciones** → Desacoplamiento de canales de envío (SMS, Email) y servicios de notificación.
3️⃣ **Adapter en Correos Electrónicos Legacy** → Compatibilización de una plataforma de marketing con un sistema antiguo de correos.
4️⃣ **Bridge en Renderizado de Figuras** → Uso de múltiples tecnologías de renderizado sin afectar la lógica de negocio.

---

### 🔹 **Beneficios y Problemas Comunes**
✅ **Adapter** mejora la compatibilidad sin afectar el código fuente.  
✅ **Bridge** reduce la proliferación de clases y desacopla la abstracción de la implementación.  
❌ **No usar Adapter si modificar la interfaz original es posible y más eficiente.**  
❌ **No usar Bridge si no hay necesidad real de intercambiar implementaciones.**  

---

## 📚 Conclusión
Los patrones **Adapter** y **Bridge** son fundamentales en la arquitectura de software moderna. 

- **Adapter** mejora la integración entre sistemas incompatibles sin alterar su código fuente.
- **Bridge** permite separar la abstracción de la implementación, evitando la proliferación innecesaria de clases.

Implementar estos patrones correctamente mejora la mantenibilidad del código y facilita la evolución del software en entornos cambiantes.
