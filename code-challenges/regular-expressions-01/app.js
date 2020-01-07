let x = [];
let y = "string With Some capital Letters.";
let z = "banana";
let a = "another String with Some";

const isNum = input => {
  let str = input.toString();
  let validator = /\d/g;
};

const isCapitalized = str => {
  let words = /[A-Z](\w+)/g
  let x = []
  let y = str.match(words);
  for (let i = 0; i < y.length; i++) {
    x.push(y[i]);
  }
  return x
};

isCapitalized(y);
