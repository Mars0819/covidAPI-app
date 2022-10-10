package com.example.asgn3;

import com.google.gson.annotations.SerializedName;

public class GetData {
    @SerializedName("data")
        private Data data;
    @SerializedName("update")
        private Update update;

        public Data getData ()
        {
            return data;
        }

        public void setData (Data data)
        {
            this.data = data;
        }

        public Update getUpdate ()
        {
            return update;
        }

        public void setUpdate (Update update)
        {
            this.update = update;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [data = "+data+", update = "+update+"]";
        }
    }



