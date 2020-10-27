import matplotlib.pyplot as plt
import seaborn as sns

ax= plt.subplot()
s1 = sns.heatmap(cf_matrix, annot=True, ax = ax,fmt = '.0f'); #annot=True to annotate cells

# labels, title and ticks
ax.set_ylim([0,2])
ax.invert_yaxis()
ax.set_xlabel('Predicted labels');ax.set_ylabel('True labels'); 
ax.set_title('Confusion Matrix'); 

ax.xaxis.set_ticklabels(['CMS', 'UB']); ax.yaxis.set_ticklabels(['CMS', 'UB']);
s1.figure.savefig("confusion_matrix_pytorch_model_demo_v1.jpeg")
