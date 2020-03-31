
        var num = 1;
        // 변수 값이 null, 0 => 거짓(false);
        // 변수 값이 있거나, "값"  => 참(true);
        function gallery(direct) {
            if (direct) { //증가
                if (num == 4)
                    return;
                num++;
            } else { //감소
                if (num == 1)
                    return;
                num--;
            }
            var photo = document.getElementById('photo');
           // console.log(photo); 버튼 누르면 읽힘
            photo.setAttribute("src", "../images/images" + num + ".jpg")
        }
        var photoElement = document.getElementById('photo');
        console.log(photoElement);
  