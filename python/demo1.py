from random import randint

def luoTaulukko(maara):
    taulukko = []
    for i in range(maara):
        taulukko.append(randint(0, 1000))
    return taulukko

def laskeMontako(taulukko, jakaja):
    montako = 0
    for i in range(len(taulukko)):
        if taulukko[i] % jakaja == 0:
            montako += 1
    return montako

maara = 1000
taulukko = luoTaulukko(maara)
kaksi = laskeMontako(taulukko, 2)
kolme = laskeMontako(taulukko, 3)
viisi = laskeMontako(taulukko, 5)

print('kahdella jaollisia oli: ', kaksi)
print('kolmella jaollisia oli: ', kolme)
print('viidella jaollisia oli: ', viisi)