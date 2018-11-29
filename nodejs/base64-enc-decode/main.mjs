
import fs from "fs";
import path from "path";
import util from "util";

const readFile = util.promisify(fs.readFile);

// Remote country code.
const main = async () => {
  const data = await readFile('./CEACAA007I32TE.dat');
  const str = Buffer.from(data, 'base64').toString();
  console.log(str)
};

export default main
