/*
* /board/read.html
* */

let cartService = (function(){
    function add(cart, callback, error){
        $.ajax({
            url: "/cart/add",
            type: "post",
            data: JSON.stringify(cart),
            contentType: "application/json; charset=utf-8", //data에 JSON 작성 시 반드시 contentType 작성
            success: function(result){
                if(callback){
                    callback(result);
                }
            },
            error: function(a, b, c){
                if(error){
                    error(a, b, c);
                }
            }
        });
    }

    function addInquiry(cart, callback, error){
        $.ajax({
            url: "/board/addInquiry",
            type: "post",
            data: JSON.stringify(cart),
            contentType: "application/json; charset=utf-8", //data에 JSON 작성 시 반드시 contentType 작성
            success: function(result){
                if(callback){
                    callback(result);
                }
            },
            error: function(a, b, c){
                if(error){
                    error(a, b, c);
                }
            }
        });
    }

    function getInquiry(inqProductId, callback, error){
        console.log(inqProductId);
        $.ajax({
            url: "/board/readInquiry/" + inqProductId,
            success: function(replies){
                if (callback){
                    console.log(replies);
                    callback(replies);
                }
            }
        })
    }
    return {add: add, addInquiry:addInquiry, getInquiry:getInquiry}
})();