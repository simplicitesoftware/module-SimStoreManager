<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://platform.simplicite.io/logos/standard/logo250.png)
* * *

`SimStoreManager` module definition
===================================

Simplicité Application Store Management
====================

Manages applications made available to Simplicité instances.

`StmApplication` business object definition
-------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `stmAppModuleName`                                           | char(100)                                | yes*     | yes       |          | -                                                                                |
| `stmAppTitle`                                                | char(100)                                | yes      | yes       |          | -                                                                                |
| `stmAppDescription`                                          | char(255)                                |          | yes       |          | -                                                                                |
| `stmAppUrl`                                                  | url(255)                                 |          | yes       |          | -                                                                                |
| `stmAppLogo`                                                 | url(255)                                 |          | yes       |          | -                                                                                |
| `stmAppSettings`                                             | text(500)                                |          | yes       |          | -                                                                                |

`StmApi` external object definition
-----------------------------------




