package com.chss;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;

import za.co.chss.client.entities.Patient;

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.ViewHolder>
                            implements Filterable, View.OnClickListener
{
    private final ArrayList<Patient> patientList;

    private PatientFilter patientFilter;
    private static Context context;

    // Provide a suitable constructor (depends on the kind of dataset)
    PatientAdapter(ArrayList<Patient> myDataset, Context aContext) {
        this.patientList = myDataset;
        context = aContext;
    }

    @Override
    public Filter getFilter() {
        if(patientFilter == null)
            patientFilter = new PatientFilter(this, patientList);
        return patientFilter;
    }

    @Override
    public void onClick(View view) {
        context.startActivity(new Intent(context, ViewPatientActivity.class));
    }

    private static class PatientFilter extends Filter {

        private final PatientAdapter adapter;

        private final ArrayList<Patient> originalList;

        private final ArrayList<Patient> filteredList;

        private PatientFilter(PatientAdapter adapter, ArrayList<Patient> originalList) {
            super();
            this.adapter = adapter;
            this.originalList = new ArrayList<>(originalList);
            this.filteredList = new ArrayList<>();
        }

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            filteredList.clear();
            final FilterResults results = new FilterResults();

            if (constraint.length() == 0) {
                filteredList.addAll(originalList);
            } else {
                final String filterPattern = constraint.toString().toLowerCase().trim();

                for (final Patient patient : originalList) {
                    String patientName = patient.getName();
                    if (patientName.contains(filterPattern)) {
                        filteredList.add(patient);
                    }
                }
            }
            results.values = filteredList;
            results.count = filteredList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            adapter.patientList.clear();
            adapter.patientList.addAll((ArrayList<Patient>) results.values);
            adapter.notifyDataSetChanged();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        public TextView infoTV;
        public TextView extraTV;

        public ViewHolder(View v) {
            super(v);
            infoTV = (TextView) v.findViewById(R.id.textViewInfo);
            extraTV = (TextView) v.findViewById(R.id.textViewExtra);

            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            context.startActivity(new Intent(context, ViewPatientActivity.class));
        }
    }

    public void add(int position, Patient item) {
        patientList.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = patientList.indexOf(item);
        patientList.remove(position);
        notifyItemRemoved(position);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PatientAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.display_patient_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.infoTV.setText(patientList.get(position).getName());
        holder.extraTV.setText(patientList.get(position).getIdNumber());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return patientList.size();
    }
}
