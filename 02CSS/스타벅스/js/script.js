// 웹브라우저에서 모든 요소가 준비되면 실행
window.onload = function () {
  // .open 버튼을 클릭하면 사라진다 (display:none;)
  // .btn_search 영역 너비(width) 값이 180px가 되어야함

  //   p[0].onclick = function () {
  //     this.style.display = "none";
  //   };
  let open_btn = document.querySelector(".btn_search .open");
  open_btn.addEventListener("click", function () {
    this.style.display = "none";
    this.parentElement.style.width = "180px";
    // let util = document.querySelector("#util");
    // util.style.right = "232px";
    document.getElementById("util").style.right = "232px";
  });

  // 내가 작성
  //   var state_open = false; // 기본적으로 닫힌상태
  //   let updown = document.querySelector("#updown");
  //   updown.addEventListener("click", function () {
  //     if (state_open) {
  //       document.getElementById("main_prom").style.height = "0px";
  //       updown.src = "images/btn_prom_down.png";
  //       state_open = false; //열려있으면 실행 후 닫음
  //     } else {
  //       document.getElementById("main_prom").style.height = "658px";
  //       updown.src = "images/btn_prom_up.png";
  //       state_open = true; // 닫혀있으면 else를 실행 후 열음
  //     }
  //   });

  // 카피
  var state_open = false;
  let prom = document.getElementById("main_prom");
  var prom_btn = document.querySelector("#notice .right a");
  var prom_img = document.querySelector("#notice .right img");

  prom_btn.addEventListener("click", function (e) {
    e.preventDefault();
    if (state_open) {
      prom.style.height = "0";
      //   prom_img.src = "images/btn_prom_down.png";
      prom_img.style.transform = "rotate(0deg)";
      state_open = false;
    } else {
      prom.style.height = "658px";
      prom_img.style.transform = "rotate(180deg)";
      state_open = true;
    }
  });
};
//util 왼쪽 232px = 415
