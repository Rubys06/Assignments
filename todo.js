var button = document.getElementById("enter");
var input = document.getElementById("userInput");
var ol = document.getElementById("myList")
 var sub=document.getElementById("submit");
 
function removeParent(evt) {
  evt.target.removeEventListener("click", removeParent);
  evt.target.parentNode.remove();
}
 var len= document.getElementsByClassName("li-1");


// function fun(){
// 	data = input.valu
function inputLength(){
	return input.value.length;
}


function createListElement() {
	var button_1 = document.createElement("button");
	button_1.innerHTML = "&#10060";
	button_1.onclick = removeParent;

	var button_2 = document.createElement("button");
	button_2.innerHTML = "EDIT";
    var text_1=document.createTextNode("Edit");
	button_2.className = "Edit";
	//button_2.onclick = edit;

	var button_3 = document.createElement("button");
	button_3.innerHTML = "SAVE";


// var input_1=document.createElement("r");
// input_1.className="input_1";
// input_1.setAttribute("contenteditable",false);
// input_1.appendChild(docu)

	var li = document.createElement("li");
	li.className="li-1";
   //li.id="li_2"
   // var x = input.value;
	// li.appendChild(document.createElement('input');
	li.appendChild(document.createTextNode(input.value));

	li.innerHTML = li.innerHTML + " ";
	li.appendChild(button_1);
	li.appendChild(button_2);
	//button_2.appendChild(text_1);
	li.appendChild(button_3);

		ol.appendChild(li);

	    input.value="";
}

 var edit=document.getElementsByClassName("Edit");
 //edit.addEventListener("click",edit);

//         //for(i=0;i<edit.length;i++){

// 		this.previousSibling.previousSibling.setAttribute("contenteditable",true);
// 		this.previousSibling.previousSibling.style.border="inset";
// 	}
// }


function addToListAfterClick(){
	if(inputLength() > 0){
			createListElement();
		}
}

function addToListAfterKeypress(event){
	if(inputLength() > 0 && event.keyCode === 13) {
		createListElement();
	}
}

 var len= document.getElementsByClassName("li-1");
 function arr(){
 for(var i=0;i<len.length;i++)
 {
  	console.log(len[i].innerText.slice(0,-9));
  }
}

  
  
button.addEventListener("click", addToListAfterClick);

input.addEventListener("keypress", addToListAfterKeypress);
sub.addEventListener("click",arr);


