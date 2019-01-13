import datetime

d =  datetime.date(2019, 8, 23)
print (d)
tday = datetime.date.today()
print( tday.year + tday.day)

print (tday.weekday())
print (tday.isoweekday())

tdelta = datetime.timedelta(days = 7)
print  (tday - tdelta)

timedelta = tday - d
print(timedelta)

bday = datetime.date(2019, 9, 30)
till_bday = bday - tday
print (till_bday)

dt = datetime.datetime(3026,7,28,12,36,45,1231)
print (dt, dt.year)

tdl = datetime.timedelta(days=7, hours=12)
print (dt + tdl)

dt = datetime.datetime.today()
dtnow = datetime.datetime.now()
dt_utc = datetime.datetime.utcnow()

print (dt, dtnow, dt_utc)