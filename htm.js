

<div class="Main">

    <div id="ques_0" class="question redbr">

        <div class="row toBeAdded">

            <div class="col-md-2">

                Question <span class="qno">0</span>

            </div>

            <div class="col-md-3">

                <input type="text" id="txtQ_0" name="txtQ_0" class="txtQuestion">

            </div>

            <div class="col-md-2">

                <input type="button" class="btnAddOption" value="Add Option">

            </div>

            <div class="col-md-2">

                <input type="button" class="btnAddQuestion" value="Add Question">

            </div>

            <div class="col-md-2 hidden divDelete">

                <input type="button" class="btnDelete" value="X">

 .row{

                margin-top: 2px;

                 margin-bottom: 2px;

        }

        .redbr{

            border:red solid 1px;

        }

        .greenbr{

            border:green solid 1px;

        }

 $('#btnSave').on('click', function () {

           

            var childrenQuestions = $('.Main').children('.question');

            var Questions = [];

            var allQuestions = CreateJsonData(childrenQuestions);

            Questions.push(allQuestions);

            var chk = 10;

        });

​

function CreateJsonData(childrenQuestions) {

       

        $.each(childrenQuestions, function (i, v) {

            var question = {};

            //Option Add

            var optionObj = $(this).children('.option');

            //Check Option Is Added Or not

            var optDiv = optionObj.find('[id^=dvoption_]');

            if (optDiv.length > 0)

|