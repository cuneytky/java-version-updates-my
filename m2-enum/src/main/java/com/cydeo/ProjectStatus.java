package com.cydeo;

public class ProjectStatus {
   // OPEN,CLOSED,PROGRESS("IN PROGRESS");
                 // in progress arasına bosluk gelmeli ama tek yazamayız.
                 // bunun yerine contr yapıp parantez içinde tanımladık bu seferde open-closed err verdi tek kelimelik ve cons kullanmadık
                 // yenide value olmadan cons tanımlayınca hata gitti
    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() {
    }
}
