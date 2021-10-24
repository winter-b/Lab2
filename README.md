# Lab2
## Teksto skaičiavimo programėlė


Naudojant „Android Studio“ integruotą programavimo aplinką (IDE), sukurti žodžių ir rašybos ženklų skaičiavimo programėlę. Programėlė turi tenkinti šiuos reikalavimus:
Bendroji dalis:
1)	Kintamųjų, metodų, klasių pavadinimai turi būti rašomi anglų kalba;
2)	Elementai turi turėti prasmingus pavadinimus (pvz. txtName  vs EditText1);
3)	Kodas rašomas naudojant Java programavimo kalbos standartus e.g.
a.	Kintamieji pradedami rašyti mažąja raide (pvz. txtUserName);
b.	Konstantos rašomos didžiosiomis raidėmis atskiriant tarpais (pvz. OPT_CHARS);
c.	Metodai rašomi pradedant mažąja raide (pvz. getWordsCount(String option));

Specialioji dalis:
1)	Programėlė turi suskaičiuoti įvestų žodžių (žodžiai atskiriami tarpais, kableliais, taškais) arba rašybos ženklų skaičių;
2)	Teksto įvedimui turi būti panaudotas TextEdit tipo elementas;
3)	Skaičiavimo tipo (žodžiai/ženklai) parinkimui turi būti naudojamas Spinner elementas;
4)	Skaičiavimai turi būti atliekami paspaudus Button tipo elementą;
5)	Rezultatas turi būti parodomas naudojant TextView tipo elementą;
6)	Programėlė turi tikrinti įvedamą tekstą (t.y. ar įvesties laukas nėra tuščias) ir parodyti pranešimą, naudojant Toast klasę, jeigu taip yra. 
7)	Žodžių/ženklų skaičiavimas turi būti atliekamas ne pagrindinėje Activity klasėje t.y. turi būti sukurta atskira klasė, kurios metodai iškviečiami pagrindinėje Activity klasėje, perduodant parametrus.
8)	Grafinių elementų tekstas turi būti naudojamas iš strings resursų failo. 
