//This is from a Youtube video that I thought described for loops fairly well.
//Youtube Link: https://www.youtube.com/watch?v=CwjSpUIFi7w

//For Loop
for (i = 1; i <= 10; ++i) {  //the video shows the incrementation using i++, but WGU says it's safer to use ++i.
  for (j = 1; j <= 10; ++j) {
    System.out.println((i * j) + " ");
  }
  System.out.println();
}
