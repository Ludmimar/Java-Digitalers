# 🏦 Validación de Ingreso a [Online Banking ](https://fintech-banco.netlify.app/) con Clave Token

## Descripción del Proyecto
Este proyecto consiste en una aplicación desarrollada en **Java** que simula el proceso de validación de ingreso a la plataforma de **Online Banking** de una entidad bancaria.  

El objetivo es garantizar que los clientes puedan autenticarse de manera segura mediante el uso de un **Token aleatorio de 6 dígitos**, además de sus credenciales tradicionales (Usuario y Contraseña).

---

## Requerimientos Funcionales
- La **Clave Token** es un número aleatorio de 6 dígitos que se genera al iniciar la aplicación.
- El cliente debe ingresar los siguientes campos (todos obligatorios):
  - **Usuario** (no distingue mayúsculas/minúsculas)
  - **Contraseña** (sensible a mayúsculas/minúsculas)
  - **Clave Token** (6 dígitos generados aleatoriamente)
- El cliente tiene un máximo de **3 intentos consecutivos** para ingresar correctamente sus credenciales.
- Tras 3 intentos fallidos consecutivos, la aplicación indicará que el usuario debe dirigirse a la **sucursal bancaria más cercana** para desbloquear sus credenciales.
- Por cada intento fallido, la aplicación preguntará al cliente si desea **continuar intentando** ingresar las credenciales.
- Si el cliente ingresa correctamente las credenciales, la aplicación notificará que ha ingresado con éxito al Online Banking.

---

## Funcionalidades
- Generación automática de un **Token aleatorio de 6 dígitos**.
- Validación de:
  - Usuario (insensible a mayúsculas/minúsculas)
  - Contraseña (sensible a mayúsculas/minúsculas)
  - Token
- Control de **intentos máximos** y mensajes de alerta en caso de bloqueos.
- Mensajes claros para informar éxito o fallo en cada intento.
- Pregunta opcional al cliente para continuar tras un intento fallido.

---


---

## Tecnologías Utilizadas
- Java SE
- IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans
- Consola para la ejecución del programa

---

## Cómo Ejecutar
1. Clonar el repositorio:
```bash
git clone https://github.com/tu-usuario/online-banking-token.git
```

📌 Autor

Martos Ludmila
#### [Linkedin](https://www.linkedin.com/in/ludmimar89/)


