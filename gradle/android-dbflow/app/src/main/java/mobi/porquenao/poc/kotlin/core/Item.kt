package mobi.porquenao.poc.kotlin.core

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel
import java.util.*

@Table(tableName = "items", databaseName = AppDatabase.NAME)
class Item : BaseModel() {

    @PrimaryKey(autoincrement = true)
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "updated_at")
    var updatedAt: Calendar = Calendar.getInstance()

}