/*
* /board/read.html
* */

let cartService = (function(){
    /*장바구니 추가 JS*/
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
    function deleteCart (cart, callback, error){
        $.ajax({
            url : "/cart/delete",
            type : "post",
            data : JSON.stringify(cart),
            contentType:"application/json; charset=utf-8",
            success:function(result){
                if(callback){
                    callback(result);
                }
            },
            error: function(a, b, c){
                if(error){
                    error(a, b, c);
                }
            }
        })
    }
    function check(cart, callback, error){
        $.ajax({
            url : "/cart/check",
            type : "post",
            data: JSON.stringify(cart),
            contentType: "application/json; charset=utf-8", //data에 JSON 작성 시 반드시 contentType 작성
            success: function(result){
                if(callback){
                    callback(result)
                }
            },
            error: function(a, b, c){
                if(error){
                    error(a, b, c);
                }
            }
        })
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
                    callback(replies);
                }
            }
        })
    }
    return {add: add, addInquiry:addInquiry, getInquiry:getInquiry, check:check, deleteCart:deleteCart}
})();