const main = {
    search() {
              const searchBox = document.getElementById("search-box");
              const searchQuery = searchBox.value;
              window.location.href = `http://192.168.0.193:8000/map/?search=${searchQuery}`;

            },
    // 초기화
    init() {
        const btnSave =document.querySelector('#btn-save');
        if(btnSave) btnSave.addEventListener('click',()=>this.save());

        const btnUpdate =document.querySelector('#btn-update');
        if(btnUpdate) btnUpdate.addEventListener('click',()=>this.update());

        const btnDelete =document.querySelector('#btn-delete');
        if(btnDelete) btnDelete.addEventListener('click',()=>this.delete());

        const btnIdSearch =document.querySelector('#btn-id-search');
        if(btnIdSearch) btnIdSearch.addEventListener('click',()=>this.idSearch());

        const btnPwSearch =document.querySelector('#btn-pw-search');
        if(btnPwSearch) btnPwSearch.addEventListener('click',()=>this.pwSearch());

    },

    async idSearch() {
        const data = {
            ssn: document.querySelector('#ssn').value,
            phone: document.querySelector('#phone').value,
        };

        fetch('/api/v1/idSearch', {
            method: "POST",
            headers: {
                "Content-Type": "application/json;charset=utf-8",
            },
            body: JSON.stringify(data),
        })
        .then((response) => {
            if (response.status === 200 || response.status === 201) {
                return response.json(); // JSON 형식의 응답 본문을 읽음
            } else {
                throw new Error("가입 정보를 다시 확인해주세요.");
            }
        })
        .then((data) => {
            const userId = data.userid;
            alert("아이디는 " + userId + " 입니다");
             window.location.href = "/log-in";
        })
        .catch((error) => {
            // 네트워크 오류 등 예외 발생
            console.log(error);
            alert(error.message);
        });
    },

    async pwSearch(){
        const data = {
            ssn: document.querySelector('#ssn').value,
            phone: document.querySelector('#phone').value,
            userid: document.querySelector('#userid').value,
        }

        fetch('/api/v1/pwSearch', {
            method: "POST",
            headers: {
                "Content-Type":"application/json;charset=utf-8",
            },
            body: JSON.stringify(data),
        })
//       .then((response) => response.json()
//        {
//           if(response.status===200||response.status===201) {
//               window.location.href="/log-in";
//           } else {
//               alert("가입 정보를 다시 확인해주세요.");
//               window.location.href="/pw_search";
//           }
//       })
        .then((response) => {
            if (response.status === 200 || response.status === 201) {
                return response.json(); // JSON 형식의 응답 본문을 읽음
            } else {
                throw new Error("비밀번호를 검색할 수 없습니다.");
            }
        })
        .then((data) => {
            // 비밀번호를 사용하여 원하는 동작을 수행
            const password = data.pw;
            alert("비밀번호는 " + password + " 입니다");
            window.location.href = "/log-in";
        })
        .catch((error) => {
            // 네트워크 오류 등 예외 발생
            console.log(error);
            alert(error.message)
        });
    },

    // 데이터 저장
    save() {

        const data = {
            userid: document.querySelector('#userid').value,
            pw: document.querySelector('#pw').value,
            ssn: document.querySelector('#ssn').value,
            phone: document.querySelector('#phone').value,
            sex: document.querySelector('#sex').value,
            age: document.querySelector('#age').value,
            firstname: document.querySelector('#firstname').value,
            lastname: document.querySelector('#lastname').value,
        };

        // fetch API를 이용해서 POST 요청을 보내고 그 결과를 처리
        fetch('/api/v1/registers', {
            method: "POST",
            headers: {
                "Content-Type":"application/json;charset=utf-8",
            },
            body: JSON.stringify(data),
        })
        .then((response) => {
            if(response.status===200||response.status===201) {
                // 저장 성공
                alert("가입이 완료되었습니다.");
                window.location.href="/";
            } else if (response.status===403) {
                // 아이디가 존재하지 않거나 비밀번호가 일치하지 않는 경우
                alert("아이디가 존재하지 않거나 비밀번호가 일치하지 않습니다.");
                window.location.href="/";
            } else if (response.status===409) {
                // 이미 존재하는 값인 경우
                alert("해당 정보는 이미 존재합니다.");
                window.location.href="/";
            } else {
                // 저장 실패
                alert("가입 실패하였습니다");
            }
        })
        .catch((error) => {
            // 네트워크 오류 등 예외 발생
            console.log(error);
            alert(error.message)
        });
    },

    update() {
        const data = {
            pw: document.querySelector('#pw').value,
            firstname: document.querySelector('#firstname').value,
            lastname: document.querySelector('#lastname').value,
            age: document.querySelector('#age').value,
            sex: document.querySelector('#sex').value,
            phone: document.querySelector('#phone').value,
        };

       const id = document.querySelector("#id").value;
       const userid = document.querySelector("#userid").value;
       fetch(`/api/v1/registers/${id}`, {
            method: "PUT",
            headers: {
                       "Content-Type":"application/json;char=utf-8",
            },
            body: JSON.stringify(data),
       }).then((response) => {
             if(response.status===200||response.status===201) {
                 // 수정 성공
                 alert("회원정보가 수정되었습니다.");
                 window.location.href="/MyPage/"+userid;
             } else {
                 // 수정 실패
                 alert("오류가 2.");
             }
       })
       .catch((error) => {
                   // 네트워크 오류 등 예외 발생
                   alert(error.message)
       });
    },
    //데이터 삭제
    delete() {
        const id = document.querySelector("#id").value;
        fetch(`/api/v1/registers/${id}`, {
                    method: "DELETE",

        }).then((response) => {
            if(response.status===200||response.status===201) {
            // 삭제 성공
            alert("회원정보가 삭제되었습니다.");
            window.location.href="/";
            } else {
            // 삭제 실패
            alert("오류가 3.");
            }
            })
            .catch((error) => {
            // 네트워크 오류 등 예외 발생
            alert(error.message)
       })
    },
}

main.init();