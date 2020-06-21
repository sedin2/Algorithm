SELECT ANIMAL_ID, NAME, (SELECT IF(SEX_UPON_INTAKE = 'Neutered Male', 'O', IF(SEX_UPON_INTAKE = 'Spayed Female', 'O', 'X'))) as '중성화'
from animal_ins order by animal_id asc;