window.addEventListener("scroll", function () {
  let scroll_y = document.documentElement.scrollTop;
  //   console.log(scroll_y);
  let header = document.querySelectorAll("header");
  if (scroll_y > 100) {
    header[0].classList.add("scrolled");
  } else {
    header[0].classList.remove("scrolled");
  }
});
