


class Student:
    

    def __init__(self,fornavn,etternavn,studentnummer,antoppgaver):
        self.__fornavn=fornavn
        self.__etternavn=etternavn
        self.__studentnummer=studentnummer
        self.__antoppgaver=antoppgaver
    #Set og get metoder    
    def setFornavn(self,fornavnet):
        self.__fornavn=fornavnet
    def getFornavn(self):
        return self.__fornavn

    def setEtternavn(self,etternavnet):
        self.__etternavn=etternavnet
    def getEtternavn(self):
        return self.__etternavn

    def setStudentnummer(self,studentnummeret):
        self.__studentnummer=studentnummeret
    def getStudentnummer(self):
        return self.__studentnummer

    def setAntoppgaver(self,antoppgaver):
        self.__antoppgaver=antoppgaver
    def getAntoppgaver(self):
        return self.__antoppgaver

def __str__(self):
    return self.__fornavn+" "+self.__etternavn+" "+str(self.__studentnummer)+" "+str(self.__antoppgaver)
    
#OPPGAVE 1B

   
studentListe=[]
oppgaveListe=[]
while True:
    valg = input("Gjør et valg: \n"\
                 "Tast 1 for å legge inn ny student\n"\
                 "Tast 2 for å endre studenter\n"\
                 "Tast 3 for å endre antall godkjent oppgaver\n"\
                 "Tast 4 for å finne gjennomsnitt av antall godkjent oppgaver\n"\
                 "Tast 5 for å søke student\n"\
                 "Tast 6 for å skrive ut alle studentene\n"\
                 "Tast 7 for å avslutt\n")

    if valg=="1":
        #Hent inn fornavn,etternavn,studentnummer og antoppgaver
        fornavn=input("Skriv inn fornavn:")
        etternavn=input("Skriv inn etternavn:")
        studentnummer=input("Skriv inn studentnummeret:")
        antoppgaver=int(input("Skriv inn antoppgaver:"))
        #Oppretter et personobjekt
        enStudent=Student(fornavn,etternavn,studentnummer,antoppgaver)
        enOppgave=antoppgaver
        #Legger personen inn i listen
        studentListe.append(enStudent)
        oppgaveListe.append(enOppgave)

    elif valg=="2":
        #Endre opplysninger om studenter
        funnet=False
        nummeret = int(input("Skriv inn studentnummer for endring av student: "))
        for studenten in studentListe:
            studnr=studenten.getStudennummer()
            if studnr==nummeret:
                funnet = True
                fornavn = input("Skriv inn nytt fornavn: ")
                etternavn = input("Skriv inn nytt etternavn: ")
                studenten.setFornavn(fornavn)
                studenten.setEtternavn(etternavn)
            if funnet == False:
                print("\nStudenten finnes ikke")
                
    elif valg=="3":
        #Endre antall godkjent oppgaver
        funnet=False
        antallet = int(input("Skriv inn studentnummer for endring av antall godkjent oppgaver: "))
        for studenten in studentListe:
            studnr=studenten.getStudentnummer()
            if studnr == antallet:
                funnet=True
                antoppgaver = input("Skriv inn nytt antoppgaver: ")
                studenten.setAntoppgaver(antoppgaver)
            if funnet == False:
                print("Studenten finnes ikke")
                
    elif valg=="4":
        summ=0
        for studenten in studentListe:
            box = studenten.getAntOppgaver()
            summ += box
        summan=summ/len(studentListe)
        print("\nGenomsnitt: {}".format(summan))
    elif valg=="5":
        funnet=False
        nummer = int(input("Skriv studnr: "))
        for studenten in studentListe:
            studnr=studenten.getStudentnummer()
            if studnr == nummer:
                funnet = True
                print(studenten)
            if funnet == False:
                print("n\Studenten finnes ikke...")

    elif valg=="6":
         for studenten in studentListe:
             print(studenten.utskrift())

    elif valg=="7":
        break
    else:
        print("Feil, prøv på nytt")
        
         
def nattonske():
    historieliste=[]
    #åpnerfilen
    try:
    #prøver å åpne fil
        historielisten=open("historieliste.txt", mode="r",encoding="UTF8")


        #Går gjennom listen
        historielisten1=[linje.rstrip() for linje in historielisten]
        for i in historieliste1:
            historieliste.append(i)
    except IOError:
        print("Historiefilen finnes ikke.")
    finally:
        historielisten.close()
    try:
        spillelistefil=open("spilleliste.txt",mode="r",encoding="UTF8")
        #går gjennom listen
        spilleliste1=[linje.rstrip() for linje in spillelistefil]
        for i in spilleliste1:
            historieliste.append(i)
    except IOError:
        print("Spillelistafilen finnes ikke.")
    finally:
        spillelistefil.close()
    try:
        outfile=open("historieliste.txt",mode="w",encoding="UTF8")
        for elem in historieliste:
            outfile.writelines(elem+"\n")
    except IOError:
        print("Filen finnes ikke")
    finally:
        outfile.close()

    #åpner fil
        sms=[]
    try:
        fil=open("sms-liste2.txt",mode="r",encoding="UTF8")

        #Går gjennom listen

        smslista=[linje.rstrip() for linje in fil]
        for i in smsliste:
            sms.append(i)
    except IOError:
        print("SMSfilen finnes ikke")
    finally:
        fil.close()
    print (sms-liste)
    try:
        outfile=open("spilleliste.txt",mode="w",encoding="UTF8")
        teller=0
        while teller<10:
            outfile.writelines(sms[0]+"\n")
            del sms[0]
            teller+=1
        teller=0
    except IOError:
        print("Spillelistefilen finnes ikke.")
    finally:
        outfile.close()
    try:
        filen=open("sms-liste2.txt",mode="w",encoding="UTF8")
        for song in sms:
            filen.writelines(song+"\n")
    except IOError:
        print("Filen finnes ikke.")
    finally:
        filen.close()


















































































                
            
                     
        
        
        
