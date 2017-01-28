# Sweet-Mother-of-SQLite
The Sweetest way into saving and loading sqlite

[![](https://jitpack.io/v/jianastrero/Sweet-Mother-of-SQLite.svg)](https://jitpack.io/#jianastrero/Sweet-Mother-of-SQLite)
[![API](https://img.shields.io/badge/API-1%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=1)


##Installation
Add the JitPack repository to your build file then add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency
```
dependencies {
    compile 'com.github.jianastrero:Sweet-Mother-of-SQLite:v1.0'
}
```


##Usage - Instruction


###Instructions
Call SweetSQLiteConfig.init atleast once in your application
```
SweetSQLiteConfig.init(this, "sweetmotherofsqliteexample");; //the first parameter is the context and the second is the database name
```


Extend SweetSQLite then call the super constructor and set the subclass instance always to this. then declare public fields. if wanted, you could add setters and getters.
```
public class SQLiteClass extends SweetSQLite {

    public String string;

    public SQLiteClass() {
        super();

        setSubclassInstance(this);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}

```


####Saving: create an instance of your subclass then call save to save all data into the sqlite database
```
SQLiteClass sqLiteClass=new SQLiteClass();
sqLiteClass.setString("Count: "+ctr);
sqLiteClass.save();
```

####Loading: create an instance of your subclass then call load. there are two ways to load, by id or by whereClause.
#####by id:
```
SQLiteClass sqLiteClass=new SQLiteClass();
sqLiteClass.load(ctr);
```
#####by whereClause:
```
SQLiteClass sqLiteClass=new SQLiteClass();
sqLiteClass.load("ID = "+ctr);
```

##Thats it! Now you can easily save and load to your sqlite database with a short and elegant code :)
