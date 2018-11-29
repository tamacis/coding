

     var obj = {
      name : "bob",
      address : "ug",

      abc : function(name) {
       this.name = name;
       console.log("this:" + this.name + "  obj:" + obj.name);
       }
     }

     var names=["berry","bon","bubble"];
     
     names.forEach(function (n) {
     obj.abc(n);
     });
    
     names.map(obj.abc);

     