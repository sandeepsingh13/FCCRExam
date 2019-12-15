package com.example.exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private LayoutInflater inflater;

    UserAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.user_vh, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = UserDataSource.getInstance().users.get(position);

        holder.tvId.setText(String.valueOf(user.id));
        holder.tvName.setText(String.valueOf(user.name));
    }

    @Override
    public int getItemCount() {
        return UserDataSource.getInstance().users.size();
    }
}
