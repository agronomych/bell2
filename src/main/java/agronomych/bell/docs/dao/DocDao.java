package agronomych.bell.docs.dao;

import agronomych.bell.docs.model.Doc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocDao {
    /**
    * Получить все объекты Country
    *
    * @return
    */
    List<Doc> all();

    /**
    * Получить имя страны name по коду code
    *
    * @param code
    * @return
    */
    Doc loadByCode(Integer code);

    /**
    * Сохранить Country
    *
    * @param doc
    */
    void save(Doc doc);
}
