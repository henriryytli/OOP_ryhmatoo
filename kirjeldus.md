Autorid: Henri Rüütli, Robert Erik Pass

Meie projektiks on lihtne mäng, mille eesmärk on vastata järjest küsimustele õigesti. Küsimusi on kahte tüüpi: matemaatilised
tehted ja silmaringi küsimused. Iga järgmine küsimus valitakse suvaliselt ja igale küsimusele õige vastuse andmine annab ühe
punkti skoorile, valesti vastates aga mäng lõppeb ning saad proovida uuesti. Programm salvestab ka kõrgeimat skoori. 

Klassid:

Küsimus.java - küsimuse jaoks abstraktne klass, kus on olemas abstraktsedmeetodid vastuse kontrollimiseks, getÕigeVastus ja 
küsimuse küsimise meetod.

MatemaatikaKüsimus.java - küsimuse alamklass, kus konstrueeritakse suvaliselt genereeritud matemaatiline tehe küsimuseks.

TriviaKüsimus.java - küsimuse alamklass, milles on trivia küsimuse konstruktor ja päritud meetodid.

Skoor.java - klass, mille eesmärk on loendada mängija skoori ja kõrgeimat skoori. Põhilise töö teeb meetodiga muudaSkoori.

MatemaatikaMäng.java - see on peaklass. Siin loendatakse trivia küsimuste tekstifailist kõik küsimused ja vastused arraylisti,
millest hakatakse küsimusi suvaliselt valima, kusjuures juba esinenud küsimusi kaks korda ei küsita. Meetodiga mängi alustatakse
ja mängitakse mängu.


Projekti protsess:

Alguses brainstormisime ideid, kui see oli leitud, tegime paar kõnet, kus arutlesime ja kodeerisime koos. Kui põhiosa oli
tehtud, viimistlesime mõlemad programmi. Peaklassi tegime mõlemad lõpuks koos [mis siia veel panna idk]

Projekti tegemisel ei olnud mingeid suuremaid probleeme, sest see pole väga keeruline ja tundsime mõlemad läbitud materjali
pigem hästi.

Saime hakkama lihtsa mänguga. Seda saaks arendada edasi, lisades näiteks rohkem sorti küsimusi, raskusastmete valiku või
graafilise kuju. Kokkuvõttes oleme mõlemad oma esimese java projektiga rahul.

Testimine:
kasutasime githubi, ning pärast arendamist testisime mõlemad oma arvutis koodi, vajadusel lihvisime seda.
