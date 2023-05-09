// numero al cuadrado
const powerOfN = (base, exponent) => {
    let result = 1;
  
    while (exponent > 0) {
      result *= base;
      exponent -= 1;
    }
  
    return result;
  };
  
  console.log(powerOfN(2, 10)); // 1024
  console.log(powerOfN(10, 2)); // 100
  console.log(powerOfN(3, 2));  // 9
  console.log(powerOfN(2, 3));  // 8