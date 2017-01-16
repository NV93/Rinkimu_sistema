# Rinkimu sistema

###Apie

Rinkimų sistema skirta informuoti visuomenę apie Seimo rinkimų rezultatus.

Prieš rinkimus sistemoje registruojamos rinkiminės apygardos bei apylinkės, kuriose vyksta balsavimas. Taip pat sistemoje registruojami dviejų tipų Seimo rinkimų kandidatai:
Kandidatai kandidatuojantys duagiamandatės sąrašuose.
Kandidatai kandidatuojantys vienmandatėse apygardose.
Rinkimų naktį, kiekviena apylinkė gali registruoti suskaičiuotus balsus. Visuomenei skirta sistemos dalis tuomet rodo balsų skaičiavimo progresą bei rinkimų rezultatus. Rezultatus apima daugiamandatės ir vienmandatės laimėtojai. Sistema taip pat gali pateikti įvairius informacijos pjūvius - kiek kuri partija surinko mandatų, kas laimėjo pasirinktas apygardas.


**Pastaba:**
>Ši sistema yra stipriai supaprastintas tikrosios VRK rinkimų sistemos modelis. Šioje sistemoje nėra nei antrojo rinkimo turo, nei atidėto rezultatų paskelbimo, nei galimybės plėsti sistemą siekiant aptarnauti daugiau vartotojų, nei daugelio kitų reikalavimų, kurie buvo taikomi tikrąjai sistemai.

#Pagrindiniai sistemos reikalavimai

##Funkciniai reikalavimai


1.  Sistemoje egzistuoja administratoriaus rolė.
2.  Sistemoje galima registruoti rinkimines apygardas, jų districts ir kandidatų sąrašus. (Žr. Apygardos duomenų modelis, FR2. Rinkimų duomenų registracija)
3.  Administratorius sistemoje gali registruoti apylinkės atstovus įgaliotus sistemoje paskelbti apylinkės balsų skaičiavimo rezultatus.
4.  Įgalioti atstovai gali paskelbti apylinkės balsų skaičiavimo rezultatus (balsų skaičių už kiekvieną sąrašą, kandidatą bei sugadintus biuletenius).
5.  Sistema gali pateikti rinkiminių apylinkių rezultatus. Pateikiami vienmandatės ir daugiamandatės rezultatai (Žr. FR5. Rinkiminių apylinkių rezultatai).
6.  Sistema gali pateikti apygardu rezultatus. Apygardų rezultatai susumuoti visų apygardai priklausančių apylinkių rezultatai (Žr. FR6. Rinkimų apygardų rezultatai).
7.  Sistema gali pateikti vienmandatėse apygardose išrinktų Seimo narių sąrašą. Sąraše kandidato vardas, pavardė, laimėta apylinkė ir surinktų balsų procentas skaičiuojant nuo visų biuletenių).
8.  Sistema gali pateikti daugiamandatės apygardos rinkimų rezultatus (Žr. FR8. Duagiamandatės apygardos rinkimų rezultatai).
9.  Sistema gali konsoliduoti rinkimų rezultatus
10.  Sistemoje egzistuoja apylinkės rinkimų komisijos atstovo rolė. Apylinkės rinkimų komisijos atstovas gali suvesti apylinkės balsų skaičiavimo rezultatus (Žr. FR10. Apylinkės balsų registravimas).
11.  Sistemos pateikiamus rinkimų rezultatus galima eksportuoti CSV formatu.
12.  Sistema gali pateikti rinkimų rezultatus išorinėms sistemoms skirtu web servisu.
13.  Sistemoje galima ieškoti kandidato ir peržiūrėti jo informaciją.

##Nefunkciniai reikalavimai

1.  Sistemos duomenys saugomi reliacinėje duomenų bazėje
2.  Programinę įrangą galima paleisti naudojant Java taikomųjų programų serverį ar konteinerį.
3.  Projekto sąranka valdoma Maven įrankiu.
4.  Vartotojo sąsajai naudojamas React karkasas.
5.  Programa kaupia detalų įvykių žurnalą (angl. log), leidžiantį operatoriui stebėti kas vyksta sistemoje. Įvykių žurnale slaptažodžiai nematomi.
6.  Slaptažodžiai saugomi užkoduoti maišos funkcija.



