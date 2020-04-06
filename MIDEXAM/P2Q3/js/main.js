(function() {
  function multiplesCount(nums, b) {
    return nums.filter(function(num) {
      return num % b == 0;
    }).length;
  }

  function reverseInPlace(nums) {
    return nums.reverse();
  }

  document.getElementById("root").innerHTML =
    "Function : " +
    multiplesCount +
    "<br/>" +
    " Execution: multiplesCount([1, 2, 3, 4, 5, 6], 3)'s result: " +
    multiplesCount([1, 2, 3, 4, 5, 6], 3) +
    "<br/> Execution: multiplesCount([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15], 5)'s result : " +
    multiplesCount([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15], 5) +
    "Function : " +
    reverseInPlace +
    "<br/>" +
    " Execution: reverseInPlace([1, 2, 3, 4, 5, 6])'s result: " +
    reverseInPlace([1, 2, 3, 4, 5, 6]);

  console.log(multiplesCount([1, 2, 3, 4, 5, 6], 3));
  console.log(multiplesCount([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15], 5));
  console.log(reverseInPlace([1, 2, 3, 4, 5, 6]));
})();
