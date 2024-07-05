    var tele = document.querySelector('#telle');

    tele.addEventListener('keyup', function(e){
      if (event.key != 'Backspace' && (tele.value.length === 3 || tele.value.length === 7)){
      tele.value += '-';
      }
    });




    let dol = document.querySelector('#dollar');

        dol.addEventListener('keyup', function(e){
            if (!dol.value.startsWith("$"))
                dol.value = "$" + dol.value;
            {
        }
    });




    const myForm = document.querySelector('#my-Form');

    myForm.addEventListener('input', e => {
      if (e.target.matches('[data-money-field]') && !e.target.value.startsWith('$')) {
        e.target.value = "$" + e.target.value.trim();

        if (e.target.value === '$') {
          e.target.value = '';
        }
      }
    });

    myForm.addEventListener('submit', e => {

      console.clear();
      const moneyFields = myForm.querySelectorAll('[data-money-field]');
      moneyFields.forEach(field => {
        console.log(`${field.name} = ${field.value}`);
      });
    });