let left = 0;
let rps = '';

setInterval(function() {
    if (left === 0) {
        left = '-260px'
        rps = '가위'
    } else if (left === '-260px') {
        left = '-520px';
        rps = '바위'
    } else {
        left = 0;
        rps = '보'
    }
    document.querySelector("#computer").style.background =
        'url(./rps.png) ' + left + ' 0';
}, 100);


document.querySelectorAll('.btn').forEach(function(btn) {
    btn.addEventListener('click', function() {
        console.log(this.textContent, left);
        alert(this.textContent + left + rps)
    });
});