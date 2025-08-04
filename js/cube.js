//id가 circle인 요소를 찾아서 저장
const circle = document.querySelector("#circle");
//id가 article인 요소를 찾아서 저장
const article = document.querySelectorAll("article");

for(let el of article){
    el.addEventListener("mouseenter",e=>{
        circle.style.animationPlaystate="paused";
    });
    el.addEventListener("mouseleave",e=>{
        circle.style.animationPlaystate="running";
    });

}