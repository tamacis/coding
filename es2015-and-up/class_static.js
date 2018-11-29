"use strict";

   var  __class_Message = {};
   __class_Message.yes = function(value) {
   console.log(value);
}
  __class_Message.no = function(value) {
   console.log(value);
}
  __class_Message_runMicroTask =
   class Message {
       constructor (reply) {

 reply(__class_Message.yes,__class_Message.yes.no);
       }
       static yes (value) {
       }
       static no (reason) {
       console.log(reason);
       }
   }

   var GoOutAmy = new Message(function(y,n) {
    y('hello');
});


  function errlog(reason){
  console.log(reason.stack);
}
   
