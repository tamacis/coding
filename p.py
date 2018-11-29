
import matplotlib as mpl
import numpy as numpy
mpl.use('Agg')
import matplotlib.pyplot as plt
from matplotlib.transforms import BlendedGenericTransform

# This makes 480x480 image I think.
fig = plt.figure(1,figsize=(6,6),dpi=80)
ax = fig.add_subplot(111)

# Remove the frame border
for direction in ['top','right','bottom','left']:
    ax.spines[direction].set_visible(False)

# Remove ticks 
ax.set_xticks([])
ax.set_yticks([])


# Draw horizontal and vertical lines
ax.axhline(linewidth=2.0, color="black")
ax.axvline(linewidth=2.0, color="black")

# Add x and y for lines
ax.text(0, 1.05, 'y', transform=BlendedGenericTransform(ax.transData, ax.transAxes))
ax.text(1.05, 0, 'x', transform=BlendedGenericTransform(ax.transAxes, ax.transData))


# Break points into x,y and labels
points = [ (2,3), (4,5),(6,5), (4,4)]
x,y = zip(*points)
labels= [(''.join("(%s,%s)" % p)) for p in points]

for i in range(len(points)):
    plt.annotate(labels[i],xy=points[i])

# draw the points
plt.scatter(x,y)

# save removing extra whitespaces
plt.savefig('fig.png', bbox_inches='tight')
plt.close()