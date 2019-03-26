window.onload = function () {
    document.getElementById('getUser').addEventListener('click', fetchUser);
    document.getElementById('topten').addEventListener('click', fetchFav);
    
};

const userUrl = 'https://api.spotify.com/v1/me';
const artistUrl = 'https://api.spotify.com/v1/me/top/artists?time_range=medium_term&limit=10&offset=5';
const apiUrl = 'https://api.spotify.com/v1/me';

var output = '';
var state = {uname: '',one :'', two: '', three:'', four: '', five: '', six: '',
seven: '',eight: '',nine: '',ten: ''};

 // semicolon injection - if JIT compiler percieves the end of a line
// as the end of a statement, it will inject a semicolon

let updateContent = function () {
    document.getElementById('user').innerText = state.uname;
    document.getElementById('one').innerHTML = state.one;
    document.getElementById('two').innerText = state.two;
    document.getElementById('three').innerText = state.three;
    document.getElementById('four').innerText = state.four;
    document.getElementById('five').innerText = state.five;
    document.getElementById('six').innerText = state.six;
    document.getElementById('seven').innerText = state.seven;
    document.getElementById('eight').innerText = state.eight;
    document.getElementById('nine').innerText = state.nine;
    document.getElementById('ten').innerText = state.ten;
}



function fetchUser() {
    fetch(userUrl, { method: "GET", headers: { "Accept": "application/json", "Content-Type": " application/json", "Authorization": "Bearer BQDR7-ieyFSy8b3AMzfNnSw7GILH_cKQoQnO9g6jrI5QDEMzsse5bsRUT07bxSh17WoAgAvZ8yvFVX0Xjl4apN_0re-iB3QBuxr2Grtdqs5q1rp7vo3RNBkAonUIb4El-712MqOo3fp6Z-PktN4R2yhCKd8qyeIbs9X0-7M4xpJFYxVv_I5Z7RKb7-ucOG6kwS9a" } })
        //define behavior for when response returns
        .then((response) => {
            return response.json();
        })
        //utilize unwrapped promise as a JS object
        .then((data) => {
            console.log(data);
            state.uname = data.display_name;
            updateContent();
        })
        //what if there's a problem?
        .catch((error) => {
            alert('oh no :(');
            console.log(error);
        });
}

function fetchFav() {
    fetch(artistUrl, { method: "GET", headers: { "Accept": "application/json", "Content-Type": " application/json", "Authorization": "Bearer BQAxV-HaWQDRyZFr9zOh1zz4bpU59s3fTOErnFHOMulwMG9LIDXtUPBj7SfgmoKVh3JU_4jrjfRM-1yBEJmcywT0c8WZh-c2mR4wmtwL90OKAPCCFkA2Tjy6lrqGrBc3HMjwsW31CDfnmBA2wzdvGO-wRWUxmgd_kPlPsKFvNRiM-p1MHFdgrAmBKfe7UwcrixJ6" } })
        //define behavior for when response returns
        .then((response) => {
            return response.json();
        })
        //utilize unwrapped promise as a JS object
        .then((data) => {
            console.log(data);
            state.one = data.items[0].name;
            state.two = data.items[1].name;
            state.three = data.items[2].name;
            state.four = data.items[3].name;
            state.five = data.items[4].name;
            state.six = data.items[5].name;
            state.seven = data.items[6].name;
            state.eight = data.items[7].name;
            state.nine = data.items[8].name;
            state.ten = data.items[9].name;
            updateContent();
        })
        //what if there's a problem?
        .catch((error) => {
            alert('oh no :(');
            console.log(error);
        });

        
            
}

function fetchArtistTop() {
    fetch(artistUrl, { method: "GET", headers: { "Accept": "application/json", "Content-Type": " application/json", "Authorization": "Bearer BQAxV-HaWQDRyZFr9zOh1zz4bpU59s3fTOErnFHOMulwMG9LIDXtUPBj7SfgmoKVh3JU_4jrjfRM-1yBEJmcywT0c8WZh-c2mR4wmtwL90OKAPCCFkA2Tjy6lrqGrBc3HMjwsW31CDfnmBA2wzdvGO-wRWUxmgd_kPlPsKFvNRiM-p1MHFdgrAmBKfe7UwcrixJ6" } })
        //define behavior for when response returns
        .then((response) => {
            return response.json();
        })
        //utilize unwrapped promise as a JS object
        .then((data) => {
            console.log(data);
            
            updateContent();
        })
        //what if there's a problem?
        .catch((error) => {
            alert('oh no :(');
            console.log(error);
        });

        
            
}
