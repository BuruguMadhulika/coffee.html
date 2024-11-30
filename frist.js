let gameNum = 42;
let userNum = promt("Guess the game number:");
while(userNum != gameNum) {
    userNum = promt("you entered wrong number. guess again:");
}
console.log("congratulations,you entered the right number");