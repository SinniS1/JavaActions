# JavaActions

## ⭐Create Mendix object -> Eg: [🔗](https://github.com/SinniS1/JavaActions/blob/main/Create_A_Obj_ByRecurstion.java)

1. Import the proxie library or specific proxie of entity file.
```java
import javaactions.proxies.*;
```
2. Create a mendix object using instantiate method then pass the context and entityName.
```java
IMendixObject mendixObj = Core.instantiate(context, entityProxy.entityName);
```
3. Create the entity object as below and pass the mendix object that you created before.
```java
entityProxie newAObj = entityProxy.initialize(context, mendixObj);
```

---

## ⭐Create List of Mendix object -> Eg: [🔗](https://github.com/SinniS1/JavaActions/blob/main/Create_A_Obj_ByRecurstion.java)

1. Create a Java List of type IMendixObject and initialize it with new ArrayList of type IMendixObject.
```java
List<IMendixObject> ObjectsList = new ArrayList<IMendixObject>();
```

---

## ⭐Retrieve Mendix Object or List -> Eg: [🔗](https://github.com/SinniS1/JavaActions/blob/main/RetrieveSearchSports.java)
1. Create a java list of IMendixObject.
2. Now use createXPathQuery funtion of Core library.
3. In the function specify the enitity path like moduleName.entityName then use execute funtion by passing the context.
```java
List<IMendixObject> SportsTeamResults = Core.createXPathQuery("//SportsWeb.SportsTeam")
					.setAmount(10)
					.setOffset(0)
					.execute(getContext());
```



