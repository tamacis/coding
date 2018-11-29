
// a promise placeholder that returns a promise with delay, and whether to resolve or reject

// @ret : return value for resolve or reason for reject
// @fate : resolve or reject
// @date : delay in ms to setTimeout

  function promisePlaceholder(ret, fate, date) {
   return new Promise (function (res, rej) {
      setTimeout(function () {
        if (fate === 1) {
           res(ret);
        }
        else {
           rej(new Error(ret));
        }
      }, date);
   });
  }


// this is meant to be copy pasted tho
module.exports = promisePlaceholder;
